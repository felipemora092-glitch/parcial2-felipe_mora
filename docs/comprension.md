# Comprensión del diseño — Enunciado B
**Nombre:** FELIPE MORA
**Fecha:** 10/19/2026

Responde con tus palabras, basándote en `docs/UML-final.md`. Respuestas
concisas (2–4 líneas por pregunta). Evidencia que entendiste el contrato
**antes** de programar.

---

### 1. Herencia y polimorfismo
¿Por qué `Modelo` es una clase abstracta y no concreta? Menciona qué método
obliga a cada subclase a implementar y qué gana el sistema con eso.

> _Tu respuesta:La clase Modelo es una clase general 
> que no se puede usar directamente, sino que sirve como base
> para crear otros modelos. En si obliga a cada uno a tener su propio método de 
> entrenamiento. Así, el sistema puede trabajar con diferentes modelos,
> sin necesidad de cambiar todo el código.

---

### 2. Composición vs. agregación
Explica la diferencia entre `Experimento ◆— Modelo` (composición) y
`Plataforma ◇— Experimento` (agregación). ¿Qué pasaría con el modelo si se
elimina el experimento? ¿Y con los experimentos si se elimina la plataforma?

> _Tu respuesta:externa.
En la composición, 
> el
> Experimento crea y depende de un Modelo, por lo que este no existe de forma independiente.
En la agregación, 
> la Plataforma agrupa experimentos que ya fueron creados por separado, sin depender directamente de ellos.

---

### 3. Asociación
En `Investigador — Experimento`, ¿quién es dueño de quién? ¿Por qué se modela
como N:M y no como composición?

> _Tu respuesta:Ninguno es dueño de nadie; ambos son independientes. Se modela como N:M 
> porque un investigador puede estar en varios experimentos y un experimento puede tener varios investigadores.
> No es composición porque si se elimina un investigador, el experimento debe seguir existiendo y pues al reves

---

### 4. Dependencia
¿Por qué `Modelo` **depende** de `MetricaEvaluacion` en lugar de **tenerlo**
como atributo? ¿Qué ventaja tiene pasar el servicio como parámetro?

> _Tu respuesta:_
Porque es un servicio puntual y no forma parte del estado interno del modelo. 
> Pasarlo como parámetro reduce el acoplamiento y permite evaluar el mismo modelo 
> con distintas métricas de forma flexible.
---

### 5. Listas
En este proyecto se usan dos estructuras distintas:
- `int[] lossPorEpoca` en `Modelo`
- `ArrayList<Experimento>` en `Plataforma`

Explica por qué en cada caso se eligió esa estructura y no la otra.

> _Tu respuesta:_**`
> int[]`:** 
> El número de épocas es fijo (`maxEpocas`), por lo que un arreglo de tamaño definido es más 
> eficiente en memoria y velocidad.
> 

- **`ArrayList`:** 
> - La cantidad de experimentos es variable e indeterminada,
> - por lo que necesita una estructura dinámica que crezca automáticamente.