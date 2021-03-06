/*******************************************************************************
 *
 *    Copyright 2020 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.magento.graphql;

import com.shopify.graphql.support.AbstractQuery;

/**
 * Represents a product price.
 */
public class ProductPriceQuery extends AbstractQuery<ProductPriceQuery> {
    ProductPriceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The price discount. Represents the difference between the regular and final price.
     */
    public ProductPriceQuery discount(ProductDiscountQueryDefinition queryDef) {
        startField("discount");

        _queryBuilder.append('{');
        queryDef.define(new ProductDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The final price of the product after discounts applied.
     */
    public ProductPriceQuery finalPrice(MoneyQueryDefinition queryDef) {
        startField("final_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The multiple FPTs that can be applied to a product price.
     */
    public ProductPriceQuery fixedProductTaxes(FixedProductTaxQueryDefinition queryDef) {
        startField("fixed_product_taxes");

        _queryBuilder.append('{');
        queryDef.define(new FixedProductTaxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The regular price of the product.
     */
    public ProductPriceQuery regularPrice(MoneyQueryDefinition queryDef) {
        startField("regular_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
