# CreateReadApp
Basic Spring Boot Application


So I have been struggling with the idea for my pet project. And did not invent anything better than recreating the small piece of the fallout game.
link: https://fallout.fandom.com/wiki/Fallout_2_ammunition

My thoughts and explanations
--------------------
I choose the ammunition as an example, so it's more about representing data of the game instances and their relations. There are melee and ranged weapons that rely on different game mechanics, that may later show up in the business layer. So I've split it into two separate classes with a mutual parent, using one table inheritance strategy. There is nothing interesting in melee class, but range weapon class should have caliber as the major source of its qualities. Caliber has too many properties and can't be included in weapon entity, cause it will create issues with repeating data and eventually will lead to an inefficient database. So I created the Ammo entity with enum class which contains all stats and mapped the Range Weapon entity to it.

Things that I'm going or not to do
--------------------
Possible expansion:
creating data queries and representing them in the controller, so users can use API.
properly validate service layer to prevent any invalid data entering API.
