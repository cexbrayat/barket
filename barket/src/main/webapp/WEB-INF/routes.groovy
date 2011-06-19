
// routes for the blobstore service example
get "/upload",  forward: "/upload.gtpl"
get "/success", forward: "/success.gtpl"
get "/failure", forward: "/failure.gtpl"
get "/home",  forward: "/index.gtpl"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"

// Subscription Form
get  "/subscribe", forward: "/subscribe.gtpl"
// POST REST action for adding new Attendee
post "/addAttendee", forward: "/addAttendee.groovy"

// List of existing themes
get  "/themes", forward: "/themes.groovy"
// Form for new theme
get "/newtheme", forward: "/newtheme.gtpl"
// POST REST action for adding new theme
post "/theme", forward: "/newtheme.groovy"
