# Reglas del proyecto (ia.erickddp.com · MiniBanco POO)

Repo de GitHub Pages (dominio `ia.erickddp.com`). Proyecto de la Lic. en IA (UTEL), materia Programación orientada a objetos.
`poo/index.html` es MiniBanco POO: HTML/CSS/JS en un solo archivo, sin build ni dependencias.

1. Conserva el estilo (tema oscuro/claro según el sistema), la estructura de 4 paneles (Acciones, El código, La memoria, Qué está pasando) y el tono didáctico en español de México. Todo concepto nuevo se explica en el momento en que aparece.
2. El Java mostrado debe ser real, válido y compilable, y la simulación debe producir exactamente lo que haría la JVM. Si hay JDK, compila y ejecuta con `javac`/`java` y compara contra la simulación. Si no hay JDK, avisa y verifica a mano.
3. Las fases ya construidas deben seguir funcionando intactas. Las tarjetas de fase de abajo son clicables para las fases construidas; las futuras quedan deshabilitadas.
4. Cada acción debe: resaltar las líneas que corrieron, actualizar el panel de memoria y explicar qué pasó y por qué, con etiquetas de concepto.
5. Los errores de compilación simulados se muestran con el mensaje real de `javac`.
6. El Java real vive en `poo/java/faseN/`, cada carpeta abrible por separado en BlueJ (*Project > Open Non BlueJ*). Mantén el README al día (rutas, tabla de proyectos y estado).
7. Antes de escribir código, presenta un plan de máximo 12 líneas y espera el OK. Un commit por fase. No hagas push salvo que se pida explícitamente.

No tocar el `index.html` de la raíz ni `CNAME`.
