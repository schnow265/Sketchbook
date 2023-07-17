# Getting started

First of all, you need to understand, is how a fabric mod is built up, because I won´t explain it.

## Cloning the Repo and building the Source using Gradle
*Please note that you WILL HAVE to use your OWN Gradle*

```
git clone https://github.com/schnow265/Sketchbook.git
cd Sketchbook

gradle genSources build
```

And now open the Folder in your favorite IDE!

## Folder Structure
```
src  
 ┗ main  
 ┃ ┣ java  
 ┃ ┃ ┗ net  
 ┃ ┃ ┃ ┗ schnow265  
 ┃ ┃ ┃ ┃ ┗ sketchbook  
 ┃ ┃ ┃ ┃ ┃ ┣ enchantment  
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ enchanter.java  (This file is used to add Enchantments to the Mod)
 ┃ ┃ ┃ ┃ ┃ ┣ item  
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ custom  
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ frameworks    
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ ModItems.java  (add the Bare Minimum Items)
 ┃ ┃ ┃ ┃ ┃ ┗ drawbook.java  
 ┃ ┗ resources  
 ┃ ┃ ┣ assets  
 ┃ ┃ ┃ ┗ sketchbook  
 ┃ ┃ ┃ ┃ ┣ blockstates   
 ┃ ┃ ┃ ┃ ┣ lang  
 ┃ ┃ ┃ ┃ ┃ ┗ en_us.json  
 ┃ ┃ ┃ ┃ ┣ models  
 ┃ ┃ ┃ ┃ ┃ ┣ block  
 ┃ ┃ ┃ ┃ ┃ ┗ item  
 ┃ ┃ ┃ ┃ ┣ textures  
 ┃ ┃ ┃ ┃ ┗ icon.png  
 ┃ ┃ ┣ data  
 ┃ ┃ ┃ ┗ sketchbook  
 ┃ ┃ ┃ ┃ ┣ loot_tables  
 ┃ ┃ ┃ ┃ ┣ patchouli_books  
 ┃ ┃ ┃ ┃ ┃ ┗ blueprints  
 ┃ ┃ ┃ ┃ ┗ recipes  
 ┃ ┃ ┗ fabric.mod.json
```

Above you can see the Structure of the *src* Folder. In the Subfolder */main/java/* you find the Java Package **net.schnow265.sketchbook** which contains the mod files.

# Folder Structures
## net.schnow265.sketchbook

```
net  
 ┗ schnow265  
 ┃ ┗ sketchbook  
 ┃ ┃ ┣ enchantment   
 ┃ ┃ ┃ ┗ enchanter.java  
 ┃ ┃ ┣ item  
 ┃ ┃ ┃ ┣ custom  
 ┃ ┃ ┃ ┃ ┗ frameworks   
 ┃ ┃ ┃ ┣ ModItemGroup.java  
 ┃ ┃ ┃ ┗ ModItems.java  
 ┃ ┃ ┗ drawbook.java
```
This folder, as explained above, is the **index package** of the mod. It contains the *highly importent* File **drawbook.java** This File is responsible for launching the mod.
## Sub-Packages
These _Sub Packages_ include:
* All Items and ItemGroups (located in item)
* **enchanter.java**, saved in the subpackage _enchantment_ and used for adding in Enchantments.
* the Sub-Package **net.schnow265.sketchbook.item.custom.frameworks** can be used, if you want to use one of my Frameworks from developing and/or rewriting vanilla Items.