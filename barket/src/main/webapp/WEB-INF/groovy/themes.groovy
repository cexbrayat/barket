
import com.google.appengine.api.datastore.*
import static com.google.appengine.api.datastore.FetchOptions.Builder.*

log.info "Retrieving themes from DB"

PreparedQuery preparedQuery = datastore.prepare(new Query("themes"))
def themes = preparedQuery.asIterable()

log.info "Forwarding to view of themes"

request.themes = themes

forward '/themes.gtpl'
