<% include '/WEB-INF/includes/header.gtpl' %>

        <h1>Saisir un nouveau thème</h1>
        <form action="/theme" method="post">
            <label for="title">Titre</label>
            <input type="input" name="title" />
            <input type="submit" value="Submit">
        </form>

<% include '/WEB-INF/includes/footer.gtpl' %>