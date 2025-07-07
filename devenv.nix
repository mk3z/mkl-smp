{
  pkgs,
  lib,
  config,
  inputs,
  ...
}: {
  languages.kotlin.enable = true;

  packages = with pkgs; [
    kotlin-language-server
    jdt-language-server
  ];
}
