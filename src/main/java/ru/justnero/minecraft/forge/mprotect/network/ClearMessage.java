package ru.justnero.minecraft.forge.mprotect.network;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import ru.justnero.minecraft.forge.mprotect.ProtectManager;

public class ClearMessage extends Message {

    public ClearMessage() {}

    @Override
    public void fromBytes(ByteBuf bytes) {

    }

    @Override
    public void toBytes(ByteBuf bytes) {

    }

    public static class Handler implements IMessageHandler<ClearMessage,IMessage> {
        @Override
        public IMessage onMessage(ClearMessage message,MessageContext ctx) {
        	FMLLog.info("Clear message");
            ProtectManager.instance().clear();
            return null;
        }
    }

}
