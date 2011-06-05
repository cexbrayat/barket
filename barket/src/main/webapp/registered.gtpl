<% include '/WEB-INF/includes/header.gtpl' %>

    <h1>Success</h1>

    <% def attendee = request.getAttribute('attendee') %>

    <div>
        User name : ${attendee.name} <br/>
    </div>

<% include '/WEB-INF/includes/footer.gtpl' %>
