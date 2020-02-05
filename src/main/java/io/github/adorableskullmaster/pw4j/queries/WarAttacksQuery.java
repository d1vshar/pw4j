package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.core.UrlBuilder;
import io.github.adorableskullmaster.pw4j.domains.WarAttacks;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class WarAttacksQuery extends Query {

    private final Integer war_id;
    private final Integer min_war_attack_id;
    private final Integer max_war_attack_id;

    public WarAttacksQuery(Integer war_id, Integer min_war_attack_id, Integer max_war_attack_id, String apiKey) {
        super(apiKey);
        this.war_id = war_id;
        this.min_war_attack_id = min_war_attack_id;
        this.max_war_attack_id = max_war_attack_id;
    }

    @Override
    public ApiQuery build() {
        String url = UrlBuilder.build(QueryURL.WAR_ATTACKS_URL, args);

        if (war_id != null) {
            url = url.concat("&war_id=")
                    .concat(Integer.toString(war_id));
        } else {
            if (max_war_attack_id != null) {
                url = url.concat("&max_war_attack_id")
                        .concat(Integer.toString(max_war_attack_id));
            }
            if (min_war_attack_id != null) {
                url = url.concat("&min_war_attack_id")
                        .concat(Integer.toString(min_war_attack_id));
            }
        }

        return new ApiQuery<>(url, new WarAttacks());
    }
}
