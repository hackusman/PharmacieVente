# 💊 PharmaVente - Système de Gestion pour Pharmacie

![Java](https://img.shields.io/badge/Java-17-%23ED8B00.svg?logo=java&logoColor=white)
![Android Dev](https://img.shields.io/badge/100%25-Mobile%20Developed-%233DDC84.svg?logo=android)
![Termux](https://img.shields.io/badge/Compilation-Termux%20Javac-%23000000.svg)

## 📱 Contexte Mobile
**Application Java développée entièrement sur smartphone Android** avec :
- ▶️ **Jvdroid** : Environnement de développement intégré
- 🔄 **Termux** : Compilation via `javac` en ligne de commande
- 📦 **GitHub Mobile** : Gestion de version professionnelle

## 🎯 Objectif
Digitaliser les ventes d'une pharmacie locale avec un module qui :
- Saisit les informations produits
- Calcule automatiquement les taxes
- Génère des factures professionnelles

## 🛠️ Configuration Requise
| Outil | Installation | Version |
|-------|-------------|---------|
| Jvdroid | [Play Store](https://play.google.com/store/apps/details?id=ru.iiec.jvdroid) | 3.2+ |
| Termux | [F-Droid](https://f-droid.org/packages/com.termux/) | 0.118+ |
| JDK | `pkg install openjdk-17` dans Termux | 17+ |

## ⚙️ Fonctionnalités Principales

### 🛒 Module de Vente
- Saisie intuitive des produits :
  - Nom du produit
  - Prix unitaire
  - Quantité désirée
- Gestion des taxes :
  - TVA paramétrable
  - Taxes supplémentaires optionnelles
- Confirmation avant validation

### 📄 Génération de Factures
- Calcul automatique des montants :
  - Montant brut HT
  - Montant TVA
  - Total TTC
- Affichage formaté en tableau :
```plaintext
┌─────────────────────────────┐
│ PARACETAMOL x2             │
├─────────────────────────────┤
│ Prix unitaire:      5.50 F │
│ Total HT:          11.00 F │
│ TVA (5.5%):         0.61 F │
├─────────────────────────────┤
│ TOTAL TTC:         11.61 F │
└─────────────────────────────┘