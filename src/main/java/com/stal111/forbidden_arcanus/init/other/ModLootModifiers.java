package com.stal111.forbidden_arcanus.init.other;

import com.stal111.forbidden_arcanus.ForbiddenArcanus;
import com.stal111.forbidden_arcanus.common.loot.BlacksmithGavelLootModifier;
import com.stal111.forbidden_arcanus.common.loot.InfernumPickaxeLootModifier;
import com.stal111.forbidden_arcanus.common.loot.MagicalFarmlandLootModifier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.valhelsia.valhelsia_core.registry.LootModifierRegistryHelper;

/**
 * Mod Loot Modifiers <br>
 * Forbidden Arcanus - com.stal111.forbidden_arcanus.init.other.ModLootModifiers
 *
 * @author stal111
 * @version 2.0.0
 * @since 2021-09-24
 */
@Mod.EventBusSubscriber
public class ModLootModifiers {

    public static final LootModifierRegistryHelper HELPER = (LootModifierRegistryHelper) ForbiddenArcanus.REGISTRY_MANAGER.getHelper(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS);

    public static final RegistryObject<BlacksmithGavelLootModifier.Serializer> BLACKSMITH_GAVEL = HELPER.register("blacksmith_gavel", BlacksmithGavelLootModifier.Serializer::new);
    public static final RegistryObject<InfernumPickaxeLootModifier.Serializer> INFERNUM_SMELTING = HELPER.register("infernum_smelting", InfernumPickaxeLootModifier.Serializer::new);
    public static final RegistryObject<MagicalFarmlandLootModifier.Serializer> MAGICAL_FARMLAND = HELPER.register("magical_farmland", MagicalFarmlandLootModifier.Serializer::new);
}