# Controle-MicroService-Angular

# Première partie du Projet :

## 1.Créer le micro-service customer-service qui permet de gérer les client
![1-1](https://user-images.githubusercontent.com/75031773/205722808-a4bc1372-8ee5-4e20-8d1a-65443ab1e547.PNG)
## 2.Créer le micro-service inventory-service qui permet de gérer les produits
![2-2](https://user-images.githubusercontent.com/75031773/205722890-8ea04a57-acee-44e9-aabc-4f59e0b2d9e7.PNG)
## 3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage
![customer-service](https://user-images.githubusercontent.com/75031773/205723505-61f9022c-69ba-43fb-a254-c5a959b72a29.PNG)
![product-service](https://user-images.githubusercontent.com/75031773/205723531-89a605b4-c8bd-44dc-96bb-18cd2e27d7e9.PNG)
## 4. Créer l'annuaire Eureka Discrovery Service
![4](https://user-images.githubusercontent.com/75031773/206153374-b83dbd56-ca6c-46a3-82c8-4c88a2fe4caa.PNG)
## 5. Faire une configuration dynamique des routes de la gateway
![1](https://user-images.githubusercontent.com/75031773/205723128-ab05172b-8bc8-4de6-831f-a76db48c8bb4.PNG)
![2](https://user-images.githubusercontent.com/75031773/205723141-0260a1d1-f97f-40d9-a752-43c9a8f95b4c.PNG)
## 6. Créer le service de facturation Billing-Service en utilisant Open Feign
![6](https://user-images.githubusercontent.com/75031773/205723824-7c7e9550-e003-4530-b236-5dc28f54b684.PNG)
## 7. Créer un client Web Angular (Clients, Produits, Factures)
![7-1](https://user-images.githubusercontent.com/75031773/205723930-60b1bf33-3084-42ee-912c-9f0a4b8c5996.PNG)
![7-2](https://user-images.githubusercontent.com/75031773/205723968-244c0c7d-9904-4c94-a358-1bd4174ebbe5.PNG)
![7-3](https://user-images.githubusercontent.com/75031773/205723985-665b524a-38a8-4f54-a413-ba742d7851b8.PNG)
## 8. Déployer le serveur keycloak :
   ### - Créer un Realm
![8-6](https://user-images.githubusercontent.com/75031773/206153504-a56b3cbc-0507-4b9f-aeb9-272720ef082e.PNG)
   ### - Créer un client à sécuriser
![8-3](https://user-images.githubusercontent.com/75031773/206153568-29eb9e24-1427-4206-8717-86a42a2ed9b0.PNG)
   ### - Créer des utilisateurs
![8-4](https://user-images.githubusercontent.com/75031773/206156516-add5cdcd-6942-4bfb-aaaa-92c02daa52a4.PNG)
   ### - Créer des rôles
![8-5](https://user-images.githubusercontent.com/75031773/206156639-a5bdf39f-01b9-4cca-9fe6-7551284f7a3d.PNG)
   ### - Affecter les rôles aux utilisateurs
![10](https://user-images.githubusercontent.com/75031773/206156704-33546253-0083-4a25-b18f-13a3d7853a64.PNG)
   ### - Tester les différents modes d'authentification avec Postman/insomnia en montrant les contenus de Access-Token, Refresh Token     
![9-1](https://user-images.githubusercontent.com/75031773/205724854-72961a16-65eb-4982-a25b-5707e4ddab08.PNG)
![9-2](https://user-images.githubusercontent.com/75031773/205724873-8fefdcac-1b60-445b-93c1-198278e32ef2.PNG)
## 9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak
avec des Fonctionnalités supplémentaires
![8](https://user-images.githubusercontent.com/75031773/205725091-f86555aa-a8a5-40ea-b3ec-9cba176bcc39.PNG)
![8-1](https://user-images.githubusercontent.com/75031773/205725171-f1844b86-5a8c-49b7-9371-998c62b7a300.PNG)
![8-2](https://user-images.githubusercontent.com/75031773/205725184-c9a62a58-6eba-4701-bd7d-0ff69388eaad.PNG)
![11](https://user-images.githubusercontent.com/75031773/205725245-78f7d485-2216-4a13-8c63-e54404e8882d.PNG)
![12](https://user-images.githubusercontent.com/75031773/205725263-24388f8e-97ee-4e8e-a025-c45e34973094.PNG)

# Dernière partie :

## 1. Intégration du Bocker KAFKA
![partie2-1](https://user-images.githubusercontent.com/75031773/213007045-60b9d3df-f6cc-4223-be91-48e40c861d13.png)
## 2. Création d'un micro-service qui permet de produire aléatoirement des factures et de les publier dans un Topic KAFKA
![partie2-2](https://user-images.githubusercontent.com/75031773/213007070-8da5c606-97f7-4acc-b3d7-5723c5514bd4.png)
## 3. Permettre au Micro-service déjà développé BILLING-SERVICE de consommer les factures publier dans le Topic KAFKA et de les enregistrer dans sa base de données
![partie2-3](https://user-images.githubusercontent.com/75031773/213007086-54c539a1-3a9a-4815-bc03-def21b9a16d1.png)
## 4. Créer un micro-service Data-Analytics-Service qui utilise l'API KAFKA Streams pour effectuer du Real Time Stream Processing en consommant le streams de facture publiées dans le Topic KAFKA
![partie2-4](https://user-images.githubusercontent.com/75031773/213007120-8eee557e-bca7-4485-bb81-c826da3673e4.png)
## 5. Créer une Page Frontend qui permet de présenter en temps réel les courbes qui montrent les résultats produits par le service du Data Analytics
![partie2-5](https://user-images.githubusercontent.com/75031773/213007137-6bb4dd82-1b78-4530-9f9a-eb2969cbd7f6.png)
## 6. Déployer l'ensemble des services de l'application en utilisant des conteneur Docker : Créer les images Docker pour chaque service et et le fichier Docker-compose.yml qui permet de déployer toute l'application
![image](https://user-images.githubusercontent.com/75031773/219880928-552138b1-a8cd-4c2e-a820-c522a41972fd.png)
![image](https://user-images.githubusercontent.com/75031773/219880959-aa1c012b-8b8d-4260-8c89-90041d3cfaf2.png)


## Simulations :

https://user-images.githubusercontent.com/75031773/213008573-5e05e025-2fdc-43dd-af52-149837c14088.mp4




