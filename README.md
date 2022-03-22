# JUnit 4
JUnit is a simple framework to write repeatable tests. It is an instance of the xUnit architecture for unit testing frameworks.

For more information, please visit:
* [Wiki](https://github.com/junit-team/junit4/wiki)
* [Download and Install guide](https://github.com/junit-team/junit4/wiki/Download-and-Install)
* [Getting Started](https://github.com/junit-team/junit4/wiki/Getting-started)

[![CI Status](https://github.com/junit-team/junit4/workflows/CI/badge.svg)](https://github.com/junit-team/junit4/actions)

# Rapport

Les modifications ont été réalisés par Vandroemme Téo.

- Correction de 5 Codes Smells : erreurs de codes comme 'static public' au lieu de 'public static' et mauvaise création des ArrayList.

- Correction de 20 Codes Smells : dans le même style qu'au dessus.

- Suppresion d'une classe Deprecated : cette classe est Assert.java au sein du paquetage framework.
  Une nouvelle classe Assert.java existe deja dans le paquetage org.junit
  Modification du code pour que le code compile( exemple : changement d'import avec la nouvelle classe)
  Il reste encore à modifier les tests.
