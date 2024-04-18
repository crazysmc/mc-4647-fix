# MC-4647 Fix

This client side 1.16.1 Fabric mod attempts to fix the bug
[MC-4647](https://bugs.mojang.com/browse/MC-4647) and possibly also the bug
[MC-10480](https://bugs.mojang.com/browse/MC-10480) where the screen goes
fully black on certain graphics cards while having blindness and night vision
effects in game.

The idea for fixing these bugs in code was taken from Forge
[FogRenderer.java.patch](
https://github.com/MinecraftForge/MinecraftForge/blob/1.16.x/patches/minecraft/net/minecraft/client/renderer/FogRenderer.java.patch)
and changed into a Fabric mixin.

## Warning

This mod is completely untested and not approved for speedrunning Minecraft.
