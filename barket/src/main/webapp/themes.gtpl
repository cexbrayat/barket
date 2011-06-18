<% include '/WEB-INF/includes/header.gtpl' %>

    <h1>List of existing Themes</h1>

    <ul>

    <% request.themes.each { theme -> %>

        <li>${theme.title}</li>

    <% } %>

    </ul>

<% include '/WEB-INF/includes/footer.gtpl' %>
