package net.rafamode.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();

    public static final FoodComponent SINASRAFA = new FoodComponent.Builder().nutrition(3000).saturationModifier(1000f).build();

    public static final ConsumableComponent SINASRAFA_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(
                    List.of(
                            new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 255),
                            new StatusEffectInstance(StatusEffects.REGENERATION, 6000, 255),
                            new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0),
                            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0),
                            new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 255),
                            new StatusEffectInstance(StatusEffects.HASTE, 6000, 255),
                            new StatusEffectInstance(StatusEffects.JUMP_BOOST, 6000, 255),
                            new StatusEffectInstance(StatusEffects.SPEED, 6000, 255),
                            new StatusEffectInstance(StatusEffects.GLOWING, 6000, 0),
                            new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 255),
                            new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6000, 0),
                            new StatusEffectInstance(StatusEffects.NIGHT_VISION, 6000, 0),
                            new StatusEffectInstance(StatusEffects.SATURATION, 6000, 255),
                            new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 6000, 255),
                            new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 6000, 255),
                            new StatusEffectInstance(StatusEffects.NAUSEA, 6000, 255),
                            new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 6000, 255),
                            new StatusEffectInstance(StatusEffects.DARKNESS, 6000, 255),
                            new StatusEffectInstance(StatusEffects.LEVITATION, 6000, 255),
                            new StatusEffectInstance(StatusEffects.BAD_OMEN, 6000, 255),
                            new StatusEffectInstance(StatusEffects.BLINDNESS, 6000, 255),
                            new StatusEffectInstance(StatusEffects.WITHER, 6000, 255),
                            new StatusEffectInstance(StatusEffects.WIND_CHARGED, 6000, 255),
                            new StatusEffectInstance(StatusEffects.WEAKNESS, 6000, 255),
                            new StatusEffectInstance(StatusEffects.WEAVING, 6000, 255),
                            new StatusEffectInstance(StatusEffects.WATER_BREATHING, 6000, 255),
                            new StatusEffectInstance(StatusEffects.OOZING, 6000, 255),
                            new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 6000, 255),
                            new StatusEffectInstance(StatusEffects.SLOWNESS, 6000, 255),
                            new StatusEffectInstance(StatusEffects.TRIAL_OMEN, 6000, 255),
                            new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 6000, 255),
                            new StatusEffectInstance(StatusEffects.INFESTED, 6000, 255),
                            new StatusEffectInstance(StatusEffects.INVISIBILITY, 6000, 255),
                            new StatusEffectInstance(StatusEffects.HUNGER, 6000, 255),
                            new StatusEffectInstance(StatusEffects.POISON, 6000, 255)
                    )
                )
            ).build();
}
