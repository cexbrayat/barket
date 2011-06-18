
import com.google.appengine.api.datastore.Entity

Entity theme = new Entity("theme")

theme << params

log.info "Saving new theme" + theme

theme.save()

log.info "Redirecting to themes list"

redirect '/themes'
