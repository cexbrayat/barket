<% include '/WEB-INF/includes/header.gtpl' %>

    <h1>Bravo!</h1>

    <% def attendee = request.getAttribute('attendee') %>

    <div>
        Vous venez d'être enregistré! Votre nom: ${attendee.name} <br/>
    </div>

<% include '/WEB-INF/includes/footer.gtpl' %>
