    // Capturar el formulario

    const update_form = document.querySelector("#formulario_modificacion")

    // Agregar evento e instrucciones al formulario

        update_form.addEventListener("submit", () => {

            const form_id = document.querySelector("#id").value;
            const form_nombre = document.querySelector("#nombre").value
            const form_apellido = document.querySelector("#apellido").value
            const form_matricula = document.querySelector("#matricula").value

            const form_data = {

                id: form_id,

                nombre: form_nombre,
                
                apellido: form_apellido,
                
                matricula: form_matricula,

                visible: "1"
                
            }

        // Configurar datos para el fetch

            const url = "/odontologos/modificar"

            const conf = {

                method: "PUT",
                headers: {

                    'Content-Type':"application/json",

                },
                body: JSON.stringify(form_data)

            }

        // Ejecutar fetch

            fetch(url, conf)
            .then(response => response.json())
            .then(data => {

                console.log("Odontologo modificado exitosamente");
                console.log(data);

                window.location.reload

            })
            .catch(error => {

                console.log("Error al enviar formulario de modificación",error);

            })

        })
