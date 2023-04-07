// Traer listado de odontologos

    window.addEventListener("load", () => {

        const url = "/odontologos/listado";

        fetch(url)
            .then(response => response.json())
            .then(data => {

                console.log(data);



            })



        




    })