const eliminarOdontologo = (data, e) =>{

    for(i=0; i<data.length; i++){

        if(data[i].id == e.target.headers){

            const put_data = {

                id: e.target.headers,

                nombre: data[i].nombre,

                apellido: data[i].apellido,

                matricula: data[i].matricula,

                visible: "0"

            }

            const url = "/odontologos/modificar"

            const conf = {

                method: "PUT",
                headers: {
        
                    'Content-Type':"application/json",
        
                },
                body: JSON.stringify(put_data)
        
            }
        
        // Ejecutar fetch
        
            fetch(url, conf)
                .then(response => response.json())
                .then(() => {
        
                    console.log("Odontologo 'eliminado' exitosamente")

                    window.location.reload
        
                })
                .catch(error => {
        
                    console.log("Error al realizar la eliminación",error);
        
                })

        }




    }
/*
    // Configuración fetch de eliminación

    const url = "/odontologos/modificar"

    const put_data = {

        id: e.target.headers,

        visible: "0"

    }

    
*/

}