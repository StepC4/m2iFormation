#language: fr

Fonctionnalité: : A description

  Règle: les scénarios commence sur la page login

    Contexte:
      Soit un étudiant sur le site "https://demoqa.com/login"

    Scénario: un étudiant remplie et valide le formulaire de connexion

      Quand il saisit son userName "User"
      Et il saisit son password "Name"
      Et il clique sur le bouton login
      Alors le message d'erreur "Invalid username or password!" apparait en rouge

    Plan du Scénario: un étudiant remplie et valide le formulaire de connexion
      Soit un étudiant sur le site <url>
      Quand il saisit son userName <username>
      Et il saisit son password <password>
      Et il clique sur le bouton login
      Alors le message d'erreur <message> apparait en rouge
      Exemples:
        | url                        | username | password | message                         |
        | "https://demoqa.com/login" | "User"   | "Name"   | "Invalid username or password!" |
        | "https://demoqa.com/login" | "Steo"   | "1234"   | "Invalid username or password!" |

      Scénario: création de compte capchat not check
        Quand il click sur ne user
        Alors il arrive sur la page de formulaire de création de compte
        Quand il saisit son prénom "Michel"
        Et il saisit son nom "Dupont"
        Et il saisit son username "M.Dupont"
        Et il saisit son password "JKl456!"
        Et clique sur le bouton register
        Alors le message d'erreur "Please verify reCaptcha to register!" apparait en rouge

      Scénario: