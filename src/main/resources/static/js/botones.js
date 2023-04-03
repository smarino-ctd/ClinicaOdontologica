    // Captura de botones
    
        const home_btn = document.querySelector("#inicio_btn")
        const guardar_btn = document.querySelector("#odontologos_btn")
        const editar_btn = document.querySelector("#buscar_btn")
        const pacientes_btn = document.querySelector("#pacientes_btn")
        const turnos_btn = document.querySelector("#turnos_btn")

    // Botón que redirige a la home

        if(home_btn != null){

            home_btn.addEventListener("click", () => {

                window.location.href = "index.html";

            })
        
        }
    
    // Botón que redirige a registrar odontologo

        if(guardar_btn != null){

            guardar_btn.addEventListener("click", () => {

                window.location.href = "altaOdontologo.html";

            })
        
        }   

    // Botón que redirige a buscar/editar odontologo

        if(editar_btn != null){

            editar_btn.addEventListener("click", () => {

                window.location.href = "busquedaOdontologo.html";

            })
        
        } 
        
    // Botones inactivos

    const sinFuncion = () => {

        alert("Funcion no implementada")

    }

    if(pacientes_btn != null){

        pacientes_btn.addEventListener("click", sinFuncion)

    }

    if(turnos_btn != null){

        turnos_btn.addEventListener("click", sinFuncion)

    }