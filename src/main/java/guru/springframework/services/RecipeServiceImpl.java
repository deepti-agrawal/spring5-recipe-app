package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepositary;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepositary repositary;

    public RecipeServiceImpl(RecipeRepositary repositary) {
        this.repositary = repositary;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.info("I am in service...");
        Set<Recipe> recipes = new HashSet<>();
        repositary.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }

    @Override
    public Recipe findById(Long id){
        log.info("I am in service...");
        return repositary.findById(id).get();

    }
}
