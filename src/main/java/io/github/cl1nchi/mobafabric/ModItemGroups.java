package io.github.cl1nchi.mobafabric;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab MOBA = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            MobaFabric.id("moba"),
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup.moba-fabric.moba"))
                    .icon(() -> new ItemStack(ModItems.MOBA_LOGO))
                    .displayItems((parameters, output) -> output.accept(ModItems.MOBA_LOGO))
                    .build()
    );

    public static void initialize() {
    }
}
