package com.geenium.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/*
This mixin comes from clothesline-fabric
https://github.com/JamiesWhiteShirt/clothesline-fabric/blob/master/src/main/java/com/jamieswhiteshirt/clotheslinefabric/mixin/item/ItemAccessor.java
 */

@Mixin(Item.class)
public interface ItemAccessor {
    @Accessor
    void setRecipeRemainder(Item item);
}
