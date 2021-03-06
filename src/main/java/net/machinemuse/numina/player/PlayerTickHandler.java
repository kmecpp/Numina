package net.machinemuse.numina.player;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;

/**
 * Author: MachineMuse (Claire Semple)
 * Created: 1:30 PM, 9/19/13
 *
 * Ported to Java by lehjr on 10/24/16.
 */
public final class PlayerTickHandler {
    @SubscribeEvent
    public static void onPlayerTick(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (livingUpdateEvent.entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) livingUpdateEvent.entityLiving;
            player.refreshDisplayName();
        }
    }
}