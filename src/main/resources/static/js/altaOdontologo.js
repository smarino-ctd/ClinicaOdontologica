// Capturar el formulario y los valores

    const formulario = document.querySelector("#formulario_alta")

    formulario.addEventListener("submit", () => {

        const form_nombre = document.querySelector("#nombre").value
        const form_apellido = document.querySelector("#apellido").value
        const form_matricula = document.querySelector("#matricula").value

        const form_data = {

            nombre: form_nombre,
            
            apellido: form_apellido,
            
            matricula: form_matricula
            
        }

    // Configurar datos para el fetch

        const url = "/odontologos/registrar"

        const conf = {

            method: "POST",
            headers: {

                'Content-Type':"application/json",

            },
            body: JSON.stringify(form_data)

        }
        
    // Ejecutar fetch

        fetch(url, conf)
            .then(response => response.json())
            .then(data => {

                console.log("Odontologo registrado exitosamente");
                console.log(data);

            })
            .catch(error => {

                console.log("Error al enviar formulario",error);

            })

        resetearFormulario()

    })

// Resetear formulario

    const resetearFormulario = () => {

        form_nombre.value = ""
        
        form_apellido.value = ""

        form_matricula.value = ""

    }


