# Laboratorio IA · ia.erickddp.com

Proyectos de la Licenciatura en Inteligencia Artificial (UTEL) de Erick Domínguez Del Prado.
Cada app explica, mientras se usa, qué código se ejecuta y por qué.

## Proyectos

| Carpeta | Proyecto | Materia | Estado |
|---|---|---|---|
| `poo/` | MiniBanco POO | Programación orientada a objetos | Fase 3 de 6 |

## MiniBanco POO

- `poo/index.html`: app web (simulación en JavaScript que muestra el código Java, la memoria y la explicación de cada paso). Las tarjetas de fase de abajo cambian entre las fases ya construidas; también se puede abrir directo con `poo/#fase1`, `poo/#fase2`…
- `poo/java/faseN/`: código Java real de cada fase. Cada carpeta es un proyecto independiente: en BlueJ, *Project > Open Non BlueJ...*, elegir la carpeta de la fase y ejecutar con clic derecho en `MiniBanco` > `void main(String[] args)`.

| Fase | Tema | Java | Estado |
|---|---|---|---|
| 1 | Clases, objetos y métodos | `poo/java/fase1/` | Lista |
| 2 | Construcción y alteración de objetos: constructores sobrecargados, `this`, `private`, getters y setter | `poo/java/fase2/` | Lista |
| 3 | Control de flujo y entrada por consola: `if`/`else if`/`else`, `switch`, `while`, `do-while`, `for` y `Scanner` | `poo/java/fase3/` | Lista |
| 4 | Arreglos | — | Pendiente |
| 5 | Herencia y polimorfismo | — | Pendiente |
| 6 | Excepciones e hilos | — | Pendiente |

Salida esperada de `fase2/MiniBanco.java`:

```
MiniBanco POO - Fase 2
Rick tiene $1600.5
Ana Sofía tiene $300.0
c1 == c3: true
```

La fase 3 es interactiva: al correr `MiniBanco` se abre la terminal de BlueJ con el menú (1 Crear, 2 Depositar, 3 Retirar, 4 Consultar, 5 Salir). Los decimales se escriben con punto (`1500.5`) porque el `Scanner` usa `Locale.US`. En la web, la terminal simulada tiene modo normal y modo paso a paso.

## Publicación (GitHub Pages)

1. Repo público, subir todo a la rama `main`.
2. Settings > Pages > Source: *Deploy from a branch* > `main` / `(root)`.
3. Custom domain: `ia.erickddp.com` (el archivo `CNAME` ya está). Activar *Enforce HTTPS* cuando aparezca.
4. DNS de erickddp.com: registro `CNAME`, host `ia`, valor `TU_USUARIO.github.io`.
