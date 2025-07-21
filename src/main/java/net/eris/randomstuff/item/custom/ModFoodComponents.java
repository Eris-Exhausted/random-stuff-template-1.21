package net.eris.randomstuff.item.custom;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {

    public static final FoodComponent POISON_MUSHROOM_STEW = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100), 0.9f)
            .usingConvertsTo(Items.BOWL)
            .alwaysEdible()
            .build();
}
