Feature: Validate api test

  Scenario: Obtener todos los tópicos
    Given url "http://127.0.0.1:60150/topicos"
    When method get
    Then status 200

  Scenario: Crear un nuevo tópico
    Given url "http://127.0.0.1:60150/topicos"
    And request { "titulo": "Nuevo Tópico", "mensaje": "Mensaje del tópico", "fecha_de_creacion": "2024-01-01", "status": "NUEVO", "usuario": { "nombre": "Usuario", "correoElectronico": "usuario@example.com" }, "curso": "Curso Ejemplo" }
    When method post
    Then status 201

  Scenario: Actualizar un tópico existente
    Given url "http://127.0.0.1:60150/topicos"
    And request {"id": 28,"titulo": "Topico actualizado nuevamente"}
    When method put
    Then status 200