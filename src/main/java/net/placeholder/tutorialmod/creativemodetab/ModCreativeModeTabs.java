package net.placeholder.tutorialmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.placeholder.tutorialmod.TutorialMod;
import net.placeholder.tutorialmod.block.Modblocks;
import net.placeholder.tutorialmod.item.ModItem;

public class ModCreativeModeTabs {

    public static final CreativeModeTab MYITEM_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "myitems_item"), FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItem.MYITEM))
                    .title(Component.translatable("creativemodetab.tutorial-mod.myitem"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItem.MYITEM);
                    })
                    .build());

    public static final CreativeModeTab AMETHYST_WOOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "amethyst_wood"), FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(Modblocks.AMETHYST_PLANK))
                    .title(Component.translatable("creativemodetab.tutorial-mod.blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(Modblocks.AMETHYST_PLANK);
                        output.accept(Modblocks.AMETHYST_LOG);
                    })
                    .build());



    public static void registerModCreativeModeTabs(){
        TutorialMod.LOGGER.info("Registering Creative Mode Tabs for " + TutorialMod.MOD_ID);
    }

}
