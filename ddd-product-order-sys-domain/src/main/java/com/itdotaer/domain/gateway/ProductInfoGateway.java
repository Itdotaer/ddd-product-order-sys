package com.itdotaer.domain.gateway;

import com.itdotaer.domain.product.ProductInfo;

/**
 * ProductInfoGateway
 *
 * @author jt_hu
 * @date 2021/9/10
 */
public interface ProductInfoGateway {

    boolean save(ProductInfo productInfo);

    ProductInfo query(Long productId);

}
