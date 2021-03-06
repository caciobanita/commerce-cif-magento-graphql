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
 * CustomerAddressRegion defines the customer&#39;s state or province
 */
public class CustomerAddressRegionQuery extends AbstractQuery<CustomerAddressRegionQuery> {
    CustomerAddressRegionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The state or province name
     */
    public CustomerAddressRegionQuery region() {
        startField("region");

        return this;
    }

    /**
     * The address region code
     */
    public CustomerAddressRegionQuery regionCode() {
        startField("region_code");

        return this;
    }

    /**
     * @deprecated Region ID is excessive on storefront and region code should suffice for all scenarios
     */
    @Deprecated
    public CustomerAddressRegionQuery regionId() {
        startField("region_id");

        return this;
    }
}
