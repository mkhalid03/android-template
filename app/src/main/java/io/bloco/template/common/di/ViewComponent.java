package io.bloco.template.common.di;

import dagger.Subcomponent;
import io.bloco.template.presentation.welcome.WelcomeView;

@PerView @Subcomponent(modules = ViewModule.class) public interface ViewComponent {
  void inject(WelcomeView welcomeView);
}