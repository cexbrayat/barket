
// routes for the blobstore service example
get "/upload",  forward: "/upload.gtpl"
get "/success", forward: "/success.gtpl"
get "/failure", forward: "/failure.gtpl"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"

// List of existing themes
get  "/themes", forward: "/themes.groovy"
// Form for new theme
get "/newtheme", forward: "/newtheme.gtpl"
// POST REST action for adding new theme
post "/theme", forward: "/newtheme.groovy"
