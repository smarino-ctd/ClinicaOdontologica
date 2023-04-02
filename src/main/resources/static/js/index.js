// Botón odontólogos

    const odontologos_btn = document.querySelector("#menu_odontologos")

    odontologos_btn.addEventListener("click", () => {


        window.location.href = "altaOdontologo.html"


    })

// Botones pacientes y turnos

    const alerta = () => {

        alert("Funcion no implementada")

    }
        

    const pacientes_btn = document.querySelector("#menu_pacientes")
    const turnos_btn = document.querySelector("#menu_turnos")

    pacientes_btn.addEventListener("click",alerta)
    turnos_btn.addEventListener("click",alerta)
