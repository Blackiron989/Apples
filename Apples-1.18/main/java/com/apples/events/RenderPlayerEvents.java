package com.apples.events;

public class RenderPlayerEvents {
	
	/*
	@SubscribeEvent
	public static void renderPlayerEvent(RenderPlayerEvent.Pre renderplayerevent) {
		
		PlayerEntity playerentity = renderplayerevent.getPlayer();
		
		if(playerentity.getRidingEntity() instanceof FireworkRocketEntity) {
			
			FireworkRocketEntity firework = (FireworkRocketEntity) playerentity.getRidingEntity();
			
			MatrixStack matrixstack = renderplayerevent.getMatrixStack();
			
			matrixstack.push();

			matrixstack.rotate(Vector3f.XN.rotation(-firework.rotationPitch));
			matrixstack.rotate(Vector3f.YN.rotation(-firework.rotationYaw));
			matrixstack.rotate(Vector3f.ZN.rotation(-firework.rotationYaw));
			
			renderplayerevent.getRenderer().render((AbstractClientPlayerEntity) playerentity, playerentity.rotationYaw, renderplayerevent.getPartialRenderTick(), matrixstack, renderplayerevent.getBuffers(), renderplayerevent.getLight());
			
			matrixstack.pop();
			
		}
		
	}*/

}
