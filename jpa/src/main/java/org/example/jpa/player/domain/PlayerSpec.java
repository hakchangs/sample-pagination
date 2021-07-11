package org.example.jpa.player.domain;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;

public class PlayerSpec {

    public static Specification<Player> name(final String name) {
        return new Specification<Player>() {
            @Override
            public Predicate toPredicate(Root<Player> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                if (StringUtils.isEmpty(name)) return null;
                return criteriaBuilder.equal(root.get("name"), name);
            }
        };

    }

}
