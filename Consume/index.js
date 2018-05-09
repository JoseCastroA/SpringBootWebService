function load(){
    $.ajax({
        url: "http://localhost:8080",
        type : "GET",
        crossDomain:true,
        crossOrigin:true,

        error: function(xhr, status, errorThrown) {
            alert(status, errorThrown);
            console.log("xhr: " + xhr);
            console.log("status: " + status);
            console.log("errorThrown: " + errorThrown);
        }
    })
    .then(function(data, status, xhr) {
        console.log("xhr: " + xhr);
        console.log("status: " + status);
        console.log("data: "+ data);
        return JSON.parse(data);
    }).then((respuesta)=>{
        var miTabla=$('#tabla');
        var codigo = "<thead> <tr> <th> Nombre </th>"+ 
                        "<th> Apellido </th> </tr> </thead>"+
                        "<tbody>";
        respuesta.forEach(element => {
            codigo+= "<tr> <td>"+element.nombre+"</td> <td>"+element.apellido+"</td> </tr>"
        });
        codigo+="</tbody>";
        miTabla.empty();
        miTabla.append(codigo);
    });
}


