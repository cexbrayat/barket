
import com.google.appengine.api.datastore.Entity


Entity attendee = new Entity("attendee")

attendee << params

log.info "Saving new attendee" + attendee

attendee.save()

log.info "Forwarding to GPTL"

request.setAttribute 'attendee', attendee

forward '/registered.gtpl'
