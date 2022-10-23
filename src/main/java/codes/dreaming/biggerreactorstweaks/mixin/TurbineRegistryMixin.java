package codes.dreaming.biggerreactorstweaks.mixin;

import net.minecraft.block.Block;
import net.roguelogix.biggerreactors.registries.TurbineCoilRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TurbineCoilRegistry.class)
public class TurbineRegistryMixin {
    @Inject(at = @At("RETURN"), method = "isBlockAllowed(Lnet/minecraft/block/Block;)Z", cancellable = true, remap = false)
    private static void onIsBlockAllowed(Block block, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
