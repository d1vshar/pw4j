package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.AllianceMembers;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class AllianceMembersQuery extends Query {

    public AllianceMembersQuery(Integer aid, String apiKey) {
        super(Integer.toString(aid), apiKey);
    }

    @Override
    public ApiQuery build() {
        String url = UrlBuilder.build(QueryURL.ALLIANCE_MEMBERS_URL, args);

        return new ApiQuery<>(url, new AllianceMembers());
    }
}
