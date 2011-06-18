html.html()
{
    head()
    {
        title 'BARCAMP'
    }
    body()
    {
        h1 'Inscrivez-vous au plus hype des barcamps de Lyon!'
        form(method : 'GET' , action : 'addAttendes.groovy')
        {
            tr()
            {
                td("Nom")
                input(type : 'text' , name : 'Nom')
            }
            tr()
            {
                td("Prenom:")
                input(type : 'text' , firstname : 'Prenom')
            }
            tr()
            {
                td("Email:")
                input(type : 'email' ,  code : 'Email')
            }
            tr()
            {
                td("Code:")
                input(type : 'code' ,  code : 'Code')
            }

            tr()
            {
                input(type : 'submit')
            }
        }
    }
}
