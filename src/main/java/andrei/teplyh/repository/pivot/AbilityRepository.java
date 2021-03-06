package andrei.teplyh.repository.pivot;

import andrei.teplyh.entity.pivot.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepository extends JpaRepository<Ability, Integer> {
    @Procedure("create_abilities")
    int createAbility(int descriptionId, String name, String description, String abilityType, int complexityLevel);

    @Procedure("delete_ability")
    boolean deleteAbility(int abilityId);

    @Procedure("associate_character_and_ability")
    boolean associateCharacterAndAbility(int abilityId, int characterId);

    @Procedure("associate_battle_and_ability")
    boolean associateBattleAndAbility(int battleId, int abilityId);
}
