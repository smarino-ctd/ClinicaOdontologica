// Captura de botones

    const home_btn = document.querySelector("#home_btn")
    const paciente_btn = document.querySelector("#pacientes_btn")
    const turno_btn = document.querySelector("#turnos_btn")
    const guardar_odontologo = document.querySelector("#guardar_odontologo")
    const listar_odontologos = document.querySelector("#lista_odontologos")

// Eventos de botones

    if(home_btn != null){

        home_btn.addEventListener("click", () => {

            window.location.href = "index.html"

        })

    }

    if(paciente_btn != null){

        paciente_btn.addEventListener("click", () => {

            window.location.href = "altaPaciente.html"

        })

    }

    if(turno_btn != null){

        turno_btn.addEventListener("click", () => {

            window.location.href = "altaTurnos.html"


        })

    }

    if(guardar_odontologo != null){

        guardar_odontologo.addEventListener("click", () => {

            window.location.href = "altaOdontologo.html"


        })

    }

    if(listar_odontologos != null){

        listar_odontologos.addEventListener("click", () => {

            window.location.href = "listaOdontologos.html"

        })

    }