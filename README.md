pattern-Observer

Ce projet s'inscrit dans le cadre de l'Activité Pratique N° 2 (encadrée par M. Mohamed Youssfi) portant sur l'étude et la mise en œuvre des patrons de conception en Java. Il implémente spécifiquement le pattern comportemental Observer.

Contexte et Objectif

Le design pattern Observer (ou Publication-Abonnement) permet de définir un mécanisme de liaison un-à-plusieurs entre des objets. Lorsqu'un objet (l'Observable) change d'état, tous ses dépendants (les Observers) en sont automatiquement notifiés et mis à jour.

Architecture du Projet (Diagramme de Classes)

Le diagramme ci-dessous illustre la structure des classes et des interfaces implémentées dans le package org.example.obs :

Description des composants :

Observable (Interface) : Définit les méthodes de gestion des abonnements (subscribe, unsubscribe) et de notification (notifyObservers).

Observer (Interface) : Définit la méthode de mise à jour (update).

ObservableImpl (Classe concrète) : Maintient la liste des observateurs abonnés, gère un état (state) et notifie les observateurs dès que cet état change.

ObserverImpl1 & ObserverImpl2 (Classes concrètes) : Implémentent la méthode update pour réagir aux notifications envoyées par l'observable.

Technologies Utilisées

Langage : Java (JDK 21)

Outil de build : Maven

Environnement de développement : IntelliJ IDEA

Référence Pédagogique

Auteur du cours : Mohamed Youssfi
