<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registro de Paciente</title>
    </head>

    <body>

        <h1>Paciente registrado correctamente</h1>

        <h2>Información del paciente</h2>

        <p><strong>Nombre:</strong> ${nombre}</p>
        <p><strong>Apellido:</strong> ${apellido}</p>
        <p><strong>Documento:</strong> ${documento}</p>
        <p><strong>Teléfono:</strong> ${telefono}</p>
        <p><strong>Dirección:</strong> ${direccion}</p>

        <br>

        <a href="index.html">Registrar otro paciente</a>

    </body>
</html>