package com.apples.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class RenderLightEmitter<T extends EntityLightEmitter> extends EntityRenderer<EntityLightEmitter> {

	protected RenderLightEmitter(EntityRendererManager renderManager) {
		
		super(renderManager);

	}

	@Override
	public ResourceLocation getEntityTexture(EntityLightEmitter entity) {

		return null;
		
	}

}
