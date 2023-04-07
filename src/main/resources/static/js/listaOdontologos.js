// TRAER LISTADO DE ODONTOLGOS

    window.addEventListener("load", () => {

       // Capturar tabla

            const tabla_resultados = document.querySelector("#tabla_resultados")

       // Crear resultados

            let filas_resultados = "";         
    
        // Fetch
        
        const url = "/odontologos/listado";
        let resultados = "";
        
        fetch(url)
            .then(response => response.json())
            .then(data => {

                // Declarar variables
        
                // Mostrar lista de odontologos
        
                    data.forEach(odontologo => {
        
                        if(odontologo.visible == "1"){
        
                            resultados =         
                        
                            `<tr>
        
                                <th class="celda_destacada">${odontologo.id}</th>
                                <th>${odontologo.nombre}</th>
                                <th>${odontologo.apellido}</th>
                                <th>${odontologo.matricula}</th>
                                <th></th>
                                <th class="celda_destacada click editar_odontologo" id="editar_odontologo" headers="${odontologo.id}">Modificar</th>
                                <th></th>
                                <th class="celda_destacada click eliminar_odontologo" id="eliminar_odontologo" headers="${odontologo.id}">Eliminar</th>
                
                            </tr>`
        
                            filas_resultados += resultados 
        
                        }
        
                    })
        
                    
                    tabla_resultados.innerHTML = filas_resultados

// MOSTRAR FORMULARIO DE MODIFICACIÓN
        
                // Capturar y asignar función a los botones modificar y eliminar
                                                            
                    const editar_odontologo = document.querySelectorAll(".editar_odontologo")
                                                            
                // Mostrar formulario
                                                            
                    if(editar_odontologo != null){
                                                            
                            editar_odontologo.forEach(btn => {
                                                            
                                btn.addEventListener("click", (e) => {
                                                                
                                    // Capturar y mostrar formulario de modificación
                                                                
                                        const formulario = document.querySelector("#update_form")
                                                                
                                        formulario.classList.toggle("hidden")
                                                                
                                    // Capturar valores del formulario de modificación
                                                                
                                        const id_form = document.querySelector("#id")
                                        const nombre_form = document.querySelector("#nombre")
                                        const apellido_form = document.querySelector("#apellido")
                                        const matricula_form = document.querySelector("#matricula")
                                                                
                                    // Buscar el odontologo a modificar
                                                                
                                                                                    
                                                                
                                        for(i=0; i<data.length; i++){
                                                                
                                            if(data[i].id == e.target.headers){
                                                                
                                                id_form.value = data[i].id
                                                nombre_form.value = data[i].nombre
                                                apellido_form.value = data[i].apellido
                                                matricula_form.value = data[i].matricula
                                                                
                                            }
                                                                
                                        }
                                                                
                                    })
                                                                        
                            })
                                                            
                    }

                // Cancelar modificación

                    const cancelar = document.querySelector("#cancelar")

                    cancelar.addEventListener("click", () => {

                        formulario.classList.toggle("hidden")

                    })
        
// CAPTURAR BOTONES DE ELIMINACIÓN

                // Capturar botónes

                    const eliminar_odontologo = document.querySelectorAll(".eliminar_odontologo")

                    eliminar_odontologo.forEach(btn => {

                        btn.addEventListener("click", (e) => {

                            eliminarOdontologo(data, e)

                        })
                        
                    });

                    

            })



            


    }) //evento


