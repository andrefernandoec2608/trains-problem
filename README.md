# 🚆 Trains Problem

Este proyecto resuelve un problema clásico de grafos propuesto para analizar rutas, distancias y recorridos entre pueblos de un sistema ferroviario. La solución fue implementada en Java, con un enfoque en diseño limpio y testeo riguroso.

## 🎯 Objetivo

Demostrar la lógica aplicada a un problema algorítmico mediante:

- Uso de **patrones de diseño**: `Singleton` y `Observable`.
- **Excepciones controladas** para manejar rutas inexistentes.
- **Cobertura de pruebas unitarias** con `JUnit` y `Mockito`.
- Gestión de dependencias con **Maven**.

## 🚀 Ejecución del proyecto

Para ejecutar el proyecto, corre la clase principal:

```bash
App.java
```

Esta clase contiene el `main()` que inicializa y resuelve los distintos requerimientos del problema.

## 🧪 Tests

Se han creado pruebas unitarias con:

- [✔️] JUnit 5
- [✔️] Mockito
- [✔️] Maven para gestión de dependencias y ejecución de tests

```bash
# Para correr los tests
mvn test
```

---

## 📝 Enunciado del Problema

### TRAINS PROBLEM

#### Problem

The local commuter railroad services a number of towns in Kiwiland. Because of monetary concerns, all of the tracks are 'one-way.' That is, a route from Kaitaia to Invercargill does not imply the existence of a route from Invercargill to Kaitaia. In fact, even if both of these routes do happen to exist, they are distinct and are not necessarily the same distance!

The purpose of this problem is to help the railroad provide its customers with information about the routes. In particular, you will compute the distance along a certain route, the number of different routes between two towns, and the shortest route between two towns.

#### Input

A directed graph where a node represents a town and an edge represents a route between two towns. The weighting of the edge represents the distance between the two towns. A given route will never appear more than once, and for a given route, the starting and ending town will not be the same town.

#### Output

For test input 1 through 5, if no such route exists, output 'NO SUCH ROUTE'. Otherwise, follow the route as given; do not make any extra stops!

#### Questions:

1. The distance of the route A-B-C.
2. The distance of the route A-D.
3. The distance of the route A-D-C.
4. The distance of the route A-E-B-C-D.
5. The distance of the route A-E-D.
6. The number of trips starting at C and ending at C with a maximum of 3 stops.
7. The number of trips starting at A and ending at C with exactly 4 stops.
8. The length of the shortest route (in terms of distance to travel) from A to C.
9. The length of the shortest route (in terms of distance to travel) from B to B.
10. The number of different routes from C to C with a distance of less than 30.

#### Test Input

Graph:
```
AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
```

#### Expected Output

```
Output #1: 9
Output #2: 5
Output #3: 13
Output #4: 22
Output #5: NO SUCH ROUTE
Output #6: 2
Output #7: 3
Output #8: 9
Output #9: 9
Output #10: 7
```

---

## 👨‍💻 Autor
[![LinkedIn](https://img.shields.io/badge/LinkedIn-André%20Llumiquinga-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/andre-llc/)
[![GitHub](https://img.shields.io/badge/GitHub-André%20Llumiquinga-black?style=flat&logo=github)](https://github.com/andrefernandoec2608)
