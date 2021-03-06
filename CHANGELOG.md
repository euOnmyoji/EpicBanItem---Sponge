# EpicBanItem Changelog

## v0.4.1

* Add UpdateChecker
* Improve display
* Fix async file tick
* Fix drop behavior
* Fix that api backward compatibility is broken

## v0.4.0

* Make locale file reloadable
* Chance ban config format
* Use game registry for trigger registry
* Adjust output of query & update command.Fix #8
* Add new trigger `join`

## v0.3.3

* Fix that regular expression on `$not` operator cannot work normally.
* Fix the wrong behavior occurred when multiple rules are applied on an item.
* Make it possible to show customizable error message immediately after an item is banned.

## v0.3.2

* Add a new flag named `--simple-capture`.

## v0.3.1

* Add air filter for checking blocks.
* Fix BlockUtil non-existence issue ([#13](https://github.com/EpicBanItemTeam/EpicBanItem/issues/13)).

## v0.3.0

* Add a new algorithm for mapping block states to items more efficiently.
* Change the permission for executing `/ebi callback` to `epicbanitem.command.editor.base`.
* Add a better way for filtering check rules by item type before they are applied to an item.

## v0.2.5

* Add a new trigger named for equip for checking armor equipments.
* Fix that the indexes in banitem.conf recognizes item ids incorrectly ([#10](https://github.com/EpicBanItemTeam/EpicBanItem/issues/10)).

## v0.2.4

* Add duplicate name check for `/ebi create`.
* Fix that duplicate backslashes occured in the output of NBT string representation.
* Set the transaction invalid for placing blocks in which there is not any update node available.

## v0.2.3

* Fix that virtual update nodes did not load properly ([#5](https://github.com/EpicBanItemTeam/EpicBanItem/issues/5)).

## v0.2.2

* Add information of the data itself when it cannot be deserialized to items and an error is thrown.
* Add a config option that disable detailed output of item-to-block mapping ([#6](https://github.com/EpicBanItemTeam/EpicBanItem/issues/6)).

## v0.2.1

* Add a new trigger named craft for filtering crafting recipes and modifying crafting results. Please add a mod named CraftingRecipeRedirector (<https://github.com/ustc-zzzz/CraftingRecipeRedirector/releases>) to your server for better experience.

## v0.1.3

* Fix issues of identifying `$` and `$[]` in update rules.
* Add `$pop` operator.

## v0.1.2

* Fix that location of BlockSnapshot may not exist in ChunkListener.

## v0.1.1

* Release a banitem with nbt plugin in sponge.
