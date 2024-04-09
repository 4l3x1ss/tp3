# tp3
Zineddine GHALMI
ALEXIS SOILLE--LECLERC

Nous avons remarqué que pour mettre à jour un fichier que nous avons modifié il faut utiliser les lignes de commandes suivantes :
-git status
-git add "Le_Fichier_Voulu"
-git commit -m "Mise à jour du fichier ..."
-git pull *Nous ne sommes pas sur de l'utilité de cette ligne*
-git push

receveur :
-git pull



git clone git@github.com:4l3x1ss/tp3.git
Cloning into 'tp3'...
Enter passphrase for key '/Users/zineddine/.ssh/id_rsa':
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (4/4), done

zineddine@MacBook-Air-de-Zineddine tp3 % git status              
On branch main
Your branch is up to date with 'origin/main'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
zineddine@MacBook-Air-de-Zineddine tp3 % git add README.md
zineddine@MacBook-Air-de-Zineddine tp3 % git status       
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
	modified:   README.md

zineddine@MacBook-Air-de-Zineddine tp3 % git commit -m "Mise à jour du fichier depuis tp2"
[main ddde399] Mise à jour du fichier depuis tp2
 Committer: Zineddine Ghalmi <zineddine@MacBook-Air-de-Zineddine.local>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 10 insertions(+), 1 deletion(-)
zineddine@MacBook-Air-de-Zineddine tp3 % git push tp3
fatal: 'tp3' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
zineddine@MacBook-Air-de-Zineddine tp3 % git push tp3
fatal: 'tp3' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
zineddine@MacBook-Air-de-Zineddine tp3 % git push origin tp3
error: src refspec tp3 does not match any
error: failed to push some refs to 'github.com:4l3x1ss/tp3.git'
zineddine@MacBook-Air-de-Zineddine tp3 % git pull
Enter passphrase for key '/Users/zineddine/.ssh/id_rsa':
Already up to date.
zineddine@MacBook-Air-de-Zineddine tp3 % git log
commit ddde399b19970eb07a2fefb5ec08a9b9875378fc (HEAD -> main)
Author: Zineddine Ghalmi <zineddine@MacBook-Air-de-Zineddine.local>
Date:   Mon Apr 8 15:56:42 2024 +0200

    Mise à jour du fichier depuis tp2

commit a6709be857dcb22db8b9b33c5c6876adc2c35ad0 (origin/main, origin/HEAD)
Author: 4l3x1ss <166036579+4l3x1ss@users.noreply.github.com>
Date:   Mon Apr 8 15:38:42 2024 +0200

    Initial commit
zineddine@MacBook-Air-de-Zineddine tp3 % git status
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
zineddine@MacBook-Air-de-Zineddine tp3 % git push
Enter passphrase for key '/Users/zineddine/.ssh/id_rsa':
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 520 bytes | 520.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To github.com:4l3x1ss/tp3.git
   a6709be..ddde399  main -> main
zineddine@MacBook-Air-de-Zineddine tp3 % git status
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean



-----------------------
La mise a jour a bien été transmise

sa230148@di-718-21:~/TP/TP-GIT-equipe16/tp1/courseGIT/tp3$ git pull
astuce: Tirer sans spécifier comment réconcilier les branches divergentes
astuce: est découragé. Vous pouvez éliminer ce message en lançant une des
astuce: commandes suivantes avant votre prochain tirage :
astuce:
astuce:   git config pull.rebase false  # fusion (stratégie par défaut)
astuce:   git config pull.rebase true   # rebasage
astuce:   git config pull.ff only       # avance rapide seulement
astuce:
astuce: Vous pouvez remplacer "git config" par "git config --global" pour que
astuce: ce soit l'option par défaut pour tous les dépôts. Vous pouvez aussi
astuce: passer --rebase, --no-rebase ou --ff-only sur la ligne de commande pour
astuce: remplacer à l'invocation la valeur par défaut configurée.
Warning: Permanently added the ECDSA host key for IP address '140.82.113.4' to the list of known hosts.
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0
Dépaquetage des objets: 100% (3/3), 1.55 Kio | 23.00 Kio/s, fait.
Depuis github.com:4l3x1ss/tp3
   ddde399..a0d0a94  main       -> origin/main
Mise à jour ddde399..a0d0a94
Fast-forward
 README.md | 87 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 1 file changed, 87 insertions(+)
sa230148@di-718-21:~/TP/TP-GIT-equipe16/tp1/courseGIT/tp3$


--------------------------------------

zineddine@MacBook-Air-de-Zineddine tp3 % git pull
Enter passphrase for key '/Users/zineddine/.ssh/id_rsa':
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 6 (delta 0), reused 6 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), 2.33 KiB | 477.00 KiB/s, done.
From github.com:4l3x1ss/tp3
   1e795a8..8da2fcf  main       -> origin/main
Updating 1e795a8..8da2fcf
Fast-forward
 src/CryptoMarche.java     | 60 +++++++++++++++++++++++++++++++++++++++++++++++++++
 src/Portefeuille.java     | 81 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 src/TestCryptoMarche.java | 63 +++++++++++++++++++++++++++++++++++++++++++++++++++++
 3 files changed, 204 insertions(+)
 create mode 100644 src/CryptoMarche.java
 create mode 100644 src/Portefeuille.java
 create mode 100644 src/TestCryptoMarche.java


--------------------------------------

zineddine@MacBook-Air-de-Zineddine src % java TestCryptoMarche.java
Test Portefeuille transfertDevise 	 ... OK
Test Portefeuille achatDevise    	 ... OK
Test CryptoMarche capitalEnEuros 	 ... OK
Test CryptoMarche capitalMonneaie 	 ... OK

---------------------------------------

zineddine@MacBook-Air-de-Zineddine tp2 % git log --graph --oneline --all --decorate --topo-order
* b51a11d (HEAD -> main, origin/main, origin/HEAD) Initial commit
zineddine@MacBook-Air-de-Zineddine tp2 % git checkout -b test
Switched to a new branch 'test'

-------------------------------------------

zineddine@MacBook-Air-de-Zineddine tp3 % git branch
* main
zineddine@MacBook-Air-de-Zineddine tp3 % git checkout -b test
Switched to a new branch 'test'
zineddine@MacBook-Air-de-Zineddine tp3 % git branch
  main
* test
zineddine@MacBook-Air-de-Zineddine tp3 % touch text.txt
zineddine@MacBook-Air-de-Zineddine tp3 % ls
README.md	src		text.txt
zineddine@MacBook-Air-de-Zineddine tp3 % git add text.txt
zineddine@MacBook-Air-de-Zineddine tp3 % git commit -m "fonction de test ajoutée "
[test 8b2d4d1] fonction de test ajoutée
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 text.txt
zineddine@MacBook-Air-de-Zineddine tp3 % git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.
zineddine@MacBook-Air-de-Zineddine tp3 % ls
README.md	src
zineddine@MacBook-Air-de-Zineddine tp3 % git log --graph --oneline --all --decorate --topo-order
* 8b2d4d1 (test) fonction de test ajoutée
* f0ac010 (HEAD -> main, origin/main, origin/HEAD) maj folder
* ccfd527 maj de README.md
* 78c75b6 maj
* 0e9f26e maj
* 989fe00 MAJ
* 0db5ad0 maj fichier java
* fd3f4d5 maj
* 6d920c4 maj
* 8da2fcf ajout de fichier
* 1e795a8 fichier maj
* 33efad5 Mise a jour du fichier README
* a0d0a94 Mise à jour du fichier README.md
* ddde399 Mise à jour du fichier depuis tp2
* a6709be Initial commit
zineddine@MacBook-Air-de-Zineddine tp3 % git branch
* main
  test
zineddine@MacBook-Air-de-Zineddine tp3 %
